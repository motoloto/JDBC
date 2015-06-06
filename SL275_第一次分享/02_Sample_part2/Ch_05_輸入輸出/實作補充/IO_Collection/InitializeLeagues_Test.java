
import java.util.*;

public class InitializeLeagues_Test {

	public static void main(String[] args) {
		InitializeLeagues dao = new InitializeLeagues();
		List<League> list = dao.LeaguesInitialized("data/leagues.txt");
		for (League aLeague : list) {
			System.out.print(aLeague.getYear() + ",\t");
			System.out.print(aLeague.getSeason() + ",\t");
			System.out.print(aLeague.getTitle());
			System.out.println();
		}

		System.out.println("**********************************");

		Iterator<League> items = list.iterator();
		while (items.hasNext()) {
			League aLeague = items.next();
			System.out.print(aLeague.getYear() + ",\t");
			System.out.print(aLeague.getSeason() + ",\t");
			System.out.print(aLeague.getTitle());
			System.out.println();
		}
	}
}
