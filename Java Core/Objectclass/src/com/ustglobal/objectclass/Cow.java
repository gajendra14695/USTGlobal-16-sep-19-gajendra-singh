package com.ustglobal.objectclass;

public class Cow {
	int id;
	String name;
	double cost;
	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	@Override
	public boolean equals(Object obj) {

		if(this==obj) {
			return true;
		}
		Cow d=(Cow)obj;
		if(this.id==d.id)
		{
			if(this.name.equals(d.name)) 
			{
				if(this.cost==d.cost)
				{
					return true;
				}

				else {
					return false;
				}
			}


			else {
				return false;
			}
		}

		else {
			return false;

		}


	}

}
