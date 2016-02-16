class Fighters {
	private String name;
	private String experticeIn;
	private int rank;
	public Fighters(String name, String skill, int rank) {
		this.name = name;
		this.experticeIn = skill;
		this.rank = rank;
	}

	public static void main(String []args) {
		Fighters fighter1 = new Fighters("Jason Statham","Wing chun",3);
		Fighters fighter2 = new Fighters("Bruce lee","Wing chun",1);
		Fighters fighter3 = new Fighters("Jackie Chan","Taekwondo",2);
		Fighters[] allFighters = {fighter1,fighter2,fighter3};
		for(Fighters fighter:allFighters){
			System.out.println(fighter.name+", Rank: "+fighter.rank);
		}
	}
}