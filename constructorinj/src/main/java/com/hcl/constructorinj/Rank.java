package com.hcl.constructorinj;

public class Rank {
int worldRank;

@Override
public String toString() {
	return "Rank [worldRank=" + worldRank + "]";
}

public Rank(int worldRank) {
	super();
	this.worldRank = worldRank;
}
}
