package lecture13.java;

public class JavaHouse {

    private final String address;
    private final LivingRoom livingRoom;

    public JavaHouse(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    /**
     * 내부 클래스는 숨겨진 외부 클래스 정보를 가지고 있어,
     * 참조를 해지하지 못하는 경우 메모리 누수가 생길 수 있고, 이를 디버깅 하기 어렵다.
     *
     * 내부 클래스의 직렬화 형태가 명확하게 정의되지 않아 직렬화에 있어 제한이 있다.
     *
     * => 클래스 안에 클래스를 만들 때는 static class 사용
     */
    public static class LivingRoom {

        private final double area;

        public LivingRoom(double area) {
            this.area = area;
        }
    }

//    public class LivingRoom {
//
//        private final double area;
//
//        public LivingRoom(double area) {
//            this.area = area;
//        }
//
//        // static inner class와 inner class의 차이 : 외부 클래스 직접 참조 가능 여부
//        public String getAddress() {
//            return JavaHouse.this.address;
//        }
//    }
}
