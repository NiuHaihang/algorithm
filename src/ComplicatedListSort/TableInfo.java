package ComplicatedListSort;

public class TableInfo implements Comparable<TableInfo>{
	private String rowkey;
	private int avg;
	private int max;
	
	public TableInfo(String rowkey,int avg,int max) {
		super();
		this.rowkey = rowkey;
		this.avg = avg;
		this.max = max;
	}
	
	public String getRowKey() {
		return rowkey;
	}
	public void setRowKey(String rowkey) {
		this.rowkey = rowkey;
	}
	public int getAvg() {
		return avg;
	}
	public void set(int avg) {
		this.avg = avg;
	}
	public int getmax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}	
	
	@Override
	public int compareTo(TableInfo myclass) {
	return this.getRowKey().compareTo(myclass.getRowKey());
	}
}




