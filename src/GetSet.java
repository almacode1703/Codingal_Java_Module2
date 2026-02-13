class TestBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class GetSet {
    public static void main(String[] args) {
        TestBean t1 = new TestBean();
        t1.setName("Codingal");
        System.out.println(t1.getName());
    }
}
