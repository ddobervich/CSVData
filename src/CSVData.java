
/***
 * A class to read/write numerical CSV files and allow easy access of data.
 * 
 * @author David
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;

	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames) {
		return null;
	}
	
	/***
	 * Returns a new CSVData object for a file ignoring lines at the top.
	 * It uses the first row as the column names.  All other data is stored
	 * as doubles.
	 * 
	 * @param filename the file to read
	 * @param numLinesToIgnore number of lines at the top to ignore
	 * @return a CSVData object for that file.
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {
		return null;
	}
	
	/***
	 * returns a row
	 * @param rowIndex index of the row to return
	 * @return the row we're returning
	 */
	public double[] getRow(int rowIndex) {
		return null;
	}
	
	public double[] getColumn(int colIndex) {
		return null;
	}
	
	public double[] getColumn(String name) {
		return null;
	}
	
	public double[][] getRows(int startIndex, int endIndex) {
		return null;
	}
	
	public double[][] getRows(int[] rowIndexes) {
		return null;
	}
	
	public double[][] getColumns(int startIndex, int endIndex) {
		return null;
	}
	
	public double[][] getColumns(int[] colIndexes) {
		return null;
	}
	
	public double[][] getColumns(String[] colNames) {
		return null;
	}
	
	public void setValue(int rowIndex, int colIndex, double newValue) {
		
	}
	
	public void saveToFile(String filename) {
		
	}
}





