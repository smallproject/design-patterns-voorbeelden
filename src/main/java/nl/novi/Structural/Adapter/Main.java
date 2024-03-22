package nl.novi.Structural.Adapter;

import nl.novi.Structural.Adapter.holes.RoundHole;
import nl.novi.Structural.Adapter.holes.RoundPeg;
import nl.novi.Structural.Adapter.holes.SquarePeg;
import nl.novi.Structural.Adapter.holes.SquarePegAdapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println("Round peg fits in hole: " + hole.fits(rpeg));

        SquarePeg smallSpeg = new SquarePeg(5);
        SquarePeg bigSpeg = new SquarePeg(10);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSpeg);
        SquarePegAdapter bigAdapter = new SquarePegAdapter(bigSpeg);

        System.out.println("Small square peg fits in hole: " + hole.fits(smallAdapter));
        System.out.println("Big square peg fits in hole: " + hole.fits(bigAdapter));
    }
}
