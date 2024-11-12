package Demo;

public class Studententityop {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Studententity  c1 = new Studententity ();
			Studententity  c2 = new Studententity ();
			Studententity  c3 = new Studententity ();
			Studententity  c4 = new Studententity ();
			Studententity  c5 = new Studententity ();
			
			c1.setCid(4004);
			c1.setCname("Gnanajothi");
			c1.setAddress("1A, Pallavan street ,vikravandi");
			c1.setCity("villupuram");
			
			c2.setCid(4005);
			c2.setCname("Pain");
			c2.setAddress("hidden rain village");
			c2.setCity("Land of Mist");
			
			c3.setCid(4006);
			c3.setCname("naruto");
			c3.setAddress("Hidden Leaf,Konoha");
			c3.setCity("Land of Fire");
			
			c4.setCid(4007);
			c4.setCname("Dhoni");
			c4.setAddress("lion's Cave , chapack");
			c4.setCity("Chennai");
			
			c5.setCid(4017);
			c5.setCname("pawan Kumar");
			c5.setAddress("Telengu Titans , teluangana");
			c5.setCity("Andhara Pradhesh");
			
			System.out.println("cid:" +c1.getCid() + "Cname:" +c1.getCname() +c1.getAddress() + c1.getCity());
			System.out.println("cid:" +c2.getCid() + "Cname:" +c2.getCname() +c2.getAddress() + c2.getCity());
			System.out.println("cid:" +c3.getCid() + "Cname:" +c3.getCname() +c3.getAddress() + c3.getCity());
			System.out.println("cid:" +c4.getCid() + "Cname:" +c4.getCname() +c4.getAddress() + c4.getCity());
			System.out.println("cid:" +c5.getCid() + "Cname:" +c5.getCname() +c5.getAddress() + c5.getCity());
			

		}

	}

