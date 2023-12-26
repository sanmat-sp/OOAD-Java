public class sparrow {
    sparrow(){
        System.out.println("A sparrow is flying");
    }
    sparrow(String name){
        System.out.println(name + " is flying");
    }
    sparrow(String name,int height){
        System.out.println(name +" is flying at height "+height + " metres.");
    }
    sparrow(String name,int height,int speed){
        System.out.println(name + " is flying at height " +height+" metres and at speed "+speed +" metres per second.");
    }
    public static void main(String [] args){
        sparrow b1 = new sparrow();
        sparrow b2 = new sparrow("sanmat");
        sparrow b3 = new sparrow("sanmat",500);
        sparrow b4 = new sparrow("sanmat",500,100);
    }
}