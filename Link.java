package th.ac.utcc.cpe.Auttapon;

/**@Auttapon_kingsawad 5907101001
 */


public class Link {
	 public long data;
	  public Link next;

	  public Link(long val) {
	    data = val;
	    next = null;
	  }

	  public void displayLink() {
	    System.out.print(data + " ");
	  }

	}  // end class

