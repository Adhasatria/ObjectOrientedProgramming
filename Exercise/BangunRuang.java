public class BangunRuang {
        public int side;
        public int length;
        public int width;
        public int height;
        public double radius;


        public BangunRuang(){
            this.side=0;
            this.length=0;
            this.width=0;
            this.height=0;
            this.radius=0;
        }

        public BangunRuang (int side){
            this.side= side;
        }

        public BangunRuang (double radius){
            this.radius= radius;
        }

        public BangunRuang (int length, int width, int height){
            this.length= length;
            this.width= width;
            this.height= height;
        }

        public void setBox(int length,int width, int height){
            this.length=length;
            this.width=width;
            this.height=height;
        }
        

        public int calculateCubeSurfaceArea(){
            return 6*side*side;
        }
        public int calculateBoxSurfaceArea(){
            return 2*(length*width + length*height +width*height);
        }
        public double calculateSphereSurfaceArea(){
            return 4*3.14*(radius*radius);
        }
        public double calculateCubeVolume(){
            return side*side*side;
        }
        public double calculateBoxVolume(){
            return length*width*height;
        }
        public double calculateSphereVolume(){
            return ((double) 4/3)*3.14*(radius*radius*radius);
        }
    public static void main(String[] args) {
        BangunRuang cube = new BangunRuang(4);
        BangunRuang box1 = new BangunRuang();
        box1.setBox(5, 5, 7);

        BangunRuang box2 = new BangunRuang(10, 5, 7);
        BangunRuang sphere = new BangunRuang(3.0);

        System.out.println(box1.calculateBoxVolume());
        System.out.println(box2.calculateBoxVolume());
        System.out.println(cube.calculateCubeSurfaceArea());
        System.out.println(sphere.calculateSphereVolume());
        
    }
} 