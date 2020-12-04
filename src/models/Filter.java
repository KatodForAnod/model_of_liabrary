package models;

public class Filter {
    private Boolean alphabetSort;
    private Boolean countCommentSort;
    private Boolean rateSort;

    public Filter() {
        alphabetSort = true;
        countCommentSort = false;
        rateSort = false;
    }

    public Boolean getAlphabetSort() {
        return alphabetSort;
    }

    public void setAlphabetSortActive() {
        alphabetSort = true;
        countCommentSort = false;
        rateSort = true;
    }

    public Boolean getCountCommentSort() {
        return countCommentSort;
    }

    public void setCountCommentSortActive() {
        countCommentSort = true;
        rateSort = false;
        alphabetSort = false;
    }

    public String getActiveSort() {
        if (getAlphabetSort()) {
            return "alphabetSort";
        }
        if (getCountCommentSort()) {
            return "countCommentSort";
        }
        if (getRateSort()) {
            return "rateSort";
        }

        return "alphabetSort";
    }

    public Boolean getRateSort() {
        return rateSort;
    }

    public void setRateSortActive() {
        rateSort = true;
        countCommentSort = false;
        alphabetSort = false;
    }


}
