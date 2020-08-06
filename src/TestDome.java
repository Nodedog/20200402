public class TestDome {
    public static void main(String[] args) {
        Book1 book = new Book1("王麻子","李四",10);
        book.setName("张三");//private 修饰，而且getName里面没有初始化就在
        //此进行初始化，变量名.setName（）；
        //再  变量名.getName（）.sout进行访问。
        System.out.println(book.getName());
        System.out.println(book.getAuther());
        //如果price没有在get 里面初始化 这时访问price时 会根据三个参数的构造方法里面的初始化值
        //也就是Book1 book = new Book1("王麻子","李四",10);里面的10
        System.out.println(book.getPrice());
        book.show();
        book.color();
        System.out.println(book);// book是引用  打印出来是 book + 他的哈希码
        //可以用 toString 打印book的属性
        new Book1().color();//匿名对象 的格式  new 类名（）.访问的方法
    }
}

class Book1{
    /*用private修饰的变量成员 需要使用 get和set方法对其进行
    获取或者修改，初始化 在对象那边进行初始化。
    *Alt+Insert 选get和set方法 idea 自动生成  可以按shift 多个选取
    * */
    private String name ;
    private String auther ;
    private int price ;
    //构造方法  这是没有参数的
    public Book1(){


        this("周杰伦","华晨宇",1999);//语法 必须将这个放在第一行如果调用的话
        System.out.println("我是cool！");

        /*this("周杰伦","华晨宇",1999);
         * 可以直接通过  this(另一个构造方法的参数) 的形式调用另一个构造方法*/
    }
    //这是带三个 参数的构造方法
    // 同时在对象实例化时 在括号里边初始化   Book1 book = new Book1("王麻子","李四",10);
    public Book1(String name, String auther, int price) {
        this.name = name;
        this.auther = auther;
        this.price = price;
    }
    // 带有三个参数的构造方法 同时打印三个
    //需要用 show方法 如下  然后在对象里面用变量名.show（）进行访问
    public void show(){

        System.out.println("name: "+name+" auther: "+auther+" price: "+price);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAuther() {
        String auther = "肖";//在get方法里面初始化
        return auther;
    }

    public void setAuther(String auther) {

        this.auther = auther;
    }

    public int getPrice() {
        int price =  10;
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }


    //Alt+Insert  选取 toString     这样就可以打印 类的属性
    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                '}';
    }

    public void color(){
        System.out.println("================");
        this.getPrice();// 可以用这种 形式  访问 普通成员方法
        System.out.println("绿色");

    }
}
