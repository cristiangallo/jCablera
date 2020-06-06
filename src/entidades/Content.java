package entidades;

import java.util.Date;

public class Content {
    private int id;
    private int news_agency_id;
    private int user_id;
    private Date modified;
    private Date created;

    public Content(int id, int news_agency_id, int user_id, java.sql.Date modified, java.sql.Date created) {
        this.id = id;
        this.news_agency_id = news_agency_id;
        this.user_id = user_id;
        this.modified = modified;
        this.created = created;
    }
}
