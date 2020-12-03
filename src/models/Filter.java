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

    public void setAlphabetSort(Boolean alphabetSort) {
        this.alphabetSort = alphabetSort;
    }

    public Boolean getCountCommentSort() {
        return countCommentSort;
    }

    public void setCountCommentSort(Boolean countCommentSort) {
        this.countCommentSort = countCommentSort;
    }

    public Boolean getRateSort() {
        return rateSort;
    }

    public void setRateSort(Boolean rateSort) {
        this.rateSort = rateSort;
    }


}
