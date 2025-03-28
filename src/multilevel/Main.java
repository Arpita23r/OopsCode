package multilevel;

public class Main {
public static void main(String[] args) {
	Child obj=new Child();
	obj.youngAge();
	obj.midAge();
	obj.oldAge();
	Parent obj1=new Parent();
	obj1.midAge();
	obj1.oldAge();
	GrandParent obj2=new GrandParent();
	obj2.oldAge();
	obj2.midAge();
}
}
