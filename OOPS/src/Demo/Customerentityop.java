package Demo;

public class Customerentityop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int m1 = 100;
				Customerentity e1 = new Customerentity();
				Customerentity e2 = new Customerentity();
				Customerentity e3 = new Customerentity ();
				
				e1.setId(4004);
				e1.setUsername("gnanajothi");
				e1.setCity("villupuram");
				
				e2.setId(4005);
				e2.setUsername("arigaran");
				e2.setCity("pondycherry");
				
				e3.setId(4006);
				e3.setUsername("hariram");
				e3.setCity("neyveli");
				
				System.out.println("Id:"+e1.getId()+"Username:"+e1.getUsername()+"City:"+e1.getCity());
				System.out.println("Id:"+e2.getId()+"Username:"+e2.getUsername()+"City:"+e2.getCity());
				System.out.println("Id:"+e3.getId()+"Username:"+e3.getUsername()+"City:"+e3.getCity());
						
					
			}

}
