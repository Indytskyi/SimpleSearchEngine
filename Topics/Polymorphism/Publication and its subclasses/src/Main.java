class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        return String.format("%s", );
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here



    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here


    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}