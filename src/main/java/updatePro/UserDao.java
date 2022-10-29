package updatePro;

import java.util.List;


import org.springframework.orm.hibernate3.HibernateTemplate;


public class UserDao {
	
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	

	

	
	//search
		public List<User> getalluser(){
			String sql="from User";
			return (List<User>) temp.find(sql);
			
		}
	//update
	public int update(User u) {
		temp.update(u);
		return 1;
			
		}
	  public User getByUserid(int id) {
	        User u = (User)temp.get(User.class, id);
	        return u;
	    }

}