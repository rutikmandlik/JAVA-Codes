/*
12).WAP to create the class name as Player with a setter and getter method with a Player details.
class Player
{  private int id;
    private String name;
    private int runs;
    public void setId(int id)
    { this.id=id;
    }
    public int getId()
    { return id;
    }
    public void setName(String name)
    { this.name=name;
    }
   public String getName()
   { return name;
    }
   public void setRuns(int runs)
    { this.runs=runs;
    }
  public int getRuns()
    { return runs;
   }
}
Create the one more class name as Team and pass Player objects in Team class using a var-args concept and show the Player details in Team class.
 
Then we need to create the class with a main method and write the code with a following logics 
 
*/

class Player
{  private int id;
    private String name;
    private int runs;
    public void setId(int id)
    { this.id=id;
    }
    public int getId()
    { return id;
    }
    public void setName(String name)
    { this.name=name;
    }
	public String getName()
	{ return name;
    }
	public void setRuns(int runs)
    { this.runs=runs;
    }
	public int getRuns()
    { return runs;
	}
}
class Team
{
	void addPlayers(Player ...p)
	{
		System.out.println("PId\tPName\tRuns");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRuns());
		}
	}
}
public class Que12
{
	public static void main(String args[])
	{
		Player p1=new Player();
		p1.setId(1);
		p1.setName("Virat");
		p1.setRuns(100);
		
		Player p2=new Player();
		p2.setId(2);
		p2.setName("Sachin");
		p2.setRuns(200);
		
		Player p3=new Player();
		p3.setId(3);
		p3.setName("Rohit");
		p3.setRuns(300);
		
		Team t1=new Team();
		t1.addPlayers(p1,p2,p3);
	}
}