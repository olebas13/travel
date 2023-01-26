package org.olebas.travel.app.model.search.criteria.range;

public class RangeCriteria {
    private final int page;
    private final int rowCount;

    public RangeCriteria(final int page, final int rowCount) {
        this.page = page;
        this.rowCount = rowCount;
    }

    public int getPage() {
        return page;
    }

    public int getRowCount() {
        return rowCount;
    }
}
