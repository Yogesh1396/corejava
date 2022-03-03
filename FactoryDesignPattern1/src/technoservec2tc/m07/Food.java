package technoservec2tc.m07;

public interface Food {
	   public String getType();
	}

	class Pizza implements Food {
	    public String getType() {
	        return "Someone ordered a Fast Food!";
	    }
	}

	class Cake implements Food {
	    public String getType() {
	        return "Someone ordered a Dessert!";
	    }
	}

	

