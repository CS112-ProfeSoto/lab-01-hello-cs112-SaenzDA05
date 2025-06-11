public class Movie {
    private String title;

    public Movie() {
        this.title = "untitled";
    }

    public Movie(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Movie Title: " + title;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        return this.title.equals(other.title);
    }
}