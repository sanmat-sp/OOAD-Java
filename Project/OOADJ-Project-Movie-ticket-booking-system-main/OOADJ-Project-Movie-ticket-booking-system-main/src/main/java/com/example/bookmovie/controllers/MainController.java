package com.example.bookmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bookmovie.models.Booking;
import com.example.bookmovie.models.Login;
import com.example.bookmovie.models.Movie;
import com.example.bookmovie.models.SeatMatrix1;
import com.example.bookmovie.models.Show;
import com.example.bookmovie.models.User;
import com.example.bookmovie.payloadResponse.LoginMessage;
import com.example.bookmovie.service.BookingService;
import com.example.bookmovie.service.MovieService;
import com.example.bookmovie.service.SeatMatrix1Service;
import com.example.bookmovie.service.SeatMatrix2Service;
import com.example.bookmovie.service.SeatMatrix3Service;
import com.example.bookmovie.service.ShowService;
import com.example.bookmovie.service.UserService;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    MovieService movieService;

    @Autowired
    UserService userService;
    @Autowired
    ShowService showService;
    // MovieController movieController;

    @Autowired
    SeatMatrix1Service seatMatrix1Service;

    @Autowired
    BookingService bookingService;
    @Autowired
    SeatMatrix2Service seatMatrix2Service;
    @Autowired
    SeatMatrix3Service seatMatrix3Service;

    boolean checkAdmin = false;
    String email;
    boolean loginStatus = false;
    Integer showCount = 0;
    LoginMessage loginMessage;

    @GetMapping("/")
    public String Home(Model model) {
        model.addAttribute("login", new Login());
        return "Login";
    }

    @GetMapping("/userLogin")
    public String loginPage(Model model) {
        model.addAttribute("login", new Login());
        return "Login";
    }

    @GetMapping("/addMovie")
    public String addMovie(Model model) {
        if (!checkAdmin)
            return "redirect:/";
        model.addAttribute("movie", new Movie());
        System.out.println("ADDMOVIE");
        return "AddMovie";
    }

    @GetMapping("/viewMovies")
    public String homePage(Model model) {
        System.out.println("HOME PAGE");
        model.addAttribute("movieList", movieService.getMovies());
        return "Home";
    }

    @GetMapping("/addShow")
    public String addShow(Model model) {
        if (!checkAdmin)
            return "redirect:/";
        model.addAttribute("show", new Show());
        return "Show";
    }

    @PostMapping("/saveShow")
    public String saveShow(Show show) {
        if (!checkAdmin)
            return "redirect:/";

        showCount++;
        // System.out.println(showCount);

        showService.addShow(show, showCount);
        return "redirect:/viewMovies";

    }

    @PostMapping("/saveMovie")
    public String saveMovie(Movie movie) {
        movieService.addMovie(movie);
        return "redirect:/viewMovies";
    }

    // @RequestParam int id
    @GetMapping("/showMovie")
    public String getShow(@RequestParam int id, Model model) {
        System.out.println(id);
        model.addAttribute("shows", showService.getShowByMovieId(id));
        return "MovieShow";
    }

    @GetMapping("/registerUser")
    public String registerUser(Model model) {
        model.addAttribute("register", new User());
        return "Register";
    }

    @GetMapping("/bookingForm")
    public String bookingForm(@RequestParam int id, @RequestParam int movieId, Model model) {
        if (id == 1) {
            model.addAttribute("matrix", seatMatrix1Service.getSeatMatrix1s());
            System.out.println(seatMatrix1Service.getSeatMatrix1s());
        } else if (id == 2) {
            model.addAttribute("matrix", seatMatrix2Service.getSeatMatrix2s());
        } else if (id == 3) {
            model.addAttribute("matrix", seatMatrix3Service.getSeatMatrix3s());
        } else {
            return "error";
        }
        model.addAttribute("showID", id);
        model.addAttribute("movieId", movieId);
        return "Booking";
    }

    @PostMapping("saveRegUser")
    public String saveUser(User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @PostMapping("/loginUser")
    public String loginUser(Login login) {
        loginMessage = userService.loginUser(login);
        System.out.println(loginMessage);
        if (loginMessage.getUserStatus().matches("admin")) {
            checkAdmin = true;
            return "redirect:/viewMovies";
        }
        if (loginMessage.getStatus()) {
            email = loginMessage.getEmail();
            loginStatus = true;
            // model.addAttribute("checkLogin", true);
            return "redirect:/viewMovies";
        } else
            return "error";
    }

    @GetMapping("/logoutUser")
    public String logout() {
        // if (loginStatus) {
        // userService.logoutUser(null);
        // // model.addAttribute("checkLogin", false);
        // // return "redirect:/";
        // }
        userService.logoutUser();
        return "redirect:/";
    }

    @GetMapping("/currUserBookings")
    public String userBookings(Model model) {
        Login currUser = userService.getCurrentUser();
        List<Booking> userBookings = bookingService.getBookingByEmail(currUser.getEmail());
        model.addAttribute("bookings", userBookings);
        return "UserBookings";
    }

    @GetMapping("/cancelBooking")
    public String cancel(@RequestParam Integer id) {
        // System.out.println(bookingService.deleteBooking(id));
        if (bookingService.deleteBooking(id))
            return "redirect:/";
        return "redirect:/currUserBookings";
    }

    @RequestMapping(value = "/selectSeat", method = RequestMethod.POST)
    public String makeSeatReserved(@RequestParam Integer colName, Integer showId, Integer movieId, Model model) {
        // Booking booking = new Booking()
        if (showId == 1) {
            seatMatrix1Service.selectSeat(colName);
            // bookingDetails(model, movieId, showId, colName);
            // System.out.println("seat reserved");
            return "redirect:/bookingDetails?movieId=" + movieId + "&&showId=" + showId + "&&colName=" + colName;

        } else if (showId == 2) {
            seatMatrix2Service.selectSeat(colName);
            // bookingDetails(model, movieId, showId, colName);
            return "redirect:/bookingDetails?movieId=" + movieId + "&&showId=" + showId + "&&colName=" + colName;

        } else if (showId == 3) {
            seatMatrix3Service.selectSeat(colName);
            // bookingDetails(model, movieId, showId, colName);

            return "redirect:/bookingDetails?movieId=" + movieId + "&&showId=" + showId + "&&colName=" + colName;

        }
        return "Invalid show id";
    }

    @GetMapping("/bookingDetails")
    public String bookingDetails(@RequestParam Integer movieId, @RequestParam Integer showId,
            @RequestParam Integer colName, Model model) {
        Login currUser = userService.getCurrentUser();
        model.addAttribute("movieId", movieId);
        model.addAttribute("showId", showId);
        model.addAttribute("seat", colName);
        model.addAttribute("owner", currUser.getEmail());
        model.addAttribute("booking", new Booking());
        System.out.println("hello");
        return "BookingDetails";
    }

    @PostMapping("/saveBooking")
    public String saveBooking(Booking booking) {
        bookingService.addBooking(booking);
        return "redirect:/viewMovies";
    }

    @PostMapping("/deselectSeat")
    public String makeSeatUnreserved(@RequestParam Integer colName, Integer showId) {
        if (showId == 1) {
            seatMatrix1Service.deselectSeat(colName);
            return "Deselected seatMatrix1";
        } else if (showId == 2) {
            seatMatrix2Service.deselectSeat(colName);
            return "Deselected seatMatrix2";
        } else if (showId == 3) {
            seatMatrix3Service.deselectSeat(colName);
            return "Deselected seatMatrix3";
        }
        return "Invalid show id";
    }

    // @PostMapping("/selectSeat/seatMatrix1")
    // public String makeSeatReserved1(@RequestParam Integer colName){
    // seatMatrix1Service.selectSeat(colName);
    // return "Selected";
    // }

    // @PostMapping("/deselectSeat/seatMatrix1")
    // public String makeSeatUnreserved1(@RequestParam Integer colName){
    // seatMatrix1Service.deselectSeat(colName);
    // return "Deselected";
    // }

    // @PostMapping("/selectSeat/seatMatrix2")
    // public String makeSeatReserved2(@RequestParam Integer colName){
    // seatMatrix2Service.selectSeat(colName);
    // return "Selected";
    // }

    // @PostMapping("/deselectSeat/seatMatrix2")
    // public String makeSeatUnreserved2(@RequestParam Integer colName){
    // seatMatrix2Service.deselectSeat(colName);
    // return "Deselected";
    // }

    // @PostMapping("/selectSeat/seatMatrix3")
    // public String makeSeatReserved3(@RequestParam Integer colName){
    // seatMatrix3Service.selectSeat(colName);
    // return "Selected";
    // }

    // @PostMapping("/deselectSeat/seatMatrix3")
    // public String makeSeatUnreserved3(@RequestParam Integer colName){
    // seatMatrix3Service.deselectSeat(colName);
    // return "Deselected";
    // }

    // @GetMapping("seatmatrix")
}
