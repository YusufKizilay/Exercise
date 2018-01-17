package test;

import java.util.concurrent.Callable;

interface IBird {
	Egg Lay();
}

class Chicken implements IBird {
	public Chicken() {
	}

	@Override
	public Egg Lay() {
		IBird ibird = new Chicken();
		Egg egg = new Egg(ibird);
		return null;

	}

	public static void main(String[] args) throws Exception {
		Chicken chicken = new Chicken();
		System.out.println(chicken instanceof IBird);
	}

}

class Egg {
	public Egg(Callable<IBird> createBird) {
		throw new UnsupportedOperationException("Waiting to be implemented.");
	}

	public IBird Hatch() throws Exception {
		throw new UnsupportedOperationException("Waiting to be implemented.");
	}
}
