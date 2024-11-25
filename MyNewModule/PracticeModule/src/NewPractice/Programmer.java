package NewPractice;

public class Programmer implements Comparable<Programmer> {
    private final String name;
    private final int experienceYears;
    private final String favoriteLang;

    public Programmer(String name, int experienceYears, String favoriteLang) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.favoriteLang = favoriteLang;
    }

    @Override
    public int compareTo(Programmer other) {
        if (this.getFavoriteLang().equals("Java") && !other.getFavoriteLang().equals("Java")) {
            return -1;
        }
        if (!this.getFavoriteLang().equals("Java") && other.getFavoriteLang().equals("Java")) {
            return 1;
        }
        return Integer.compare(other.experienceYears, this.experienceYears);
    }

    public String getFavoriteLang() {
        return favoriteLang;
    }

    @Override
    public String toString() {
        return "\n" + name + " (" + experienceYears + " лет опыта, пишет на " + favoriteLang + ")";
    }
}
