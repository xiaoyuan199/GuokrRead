package io.github.anthonyeef.guokrread.rest.model;

import java.util.List;

/**
 * Created by anthonyeef on 12/10/15.
 */
public class Comment {

    private String now;
    private boolean ok;
    private long limit;

    /*TODO: Add Comment type*/
    private List<result> mResultList;

    private class result {
        private long floor;

    }

}
