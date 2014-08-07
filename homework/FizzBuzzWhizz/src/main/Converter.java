public class Converter {
    private String[] inputElements;

    public Converter(String inputString) {
        inputElements = inputString.split("\\D");
    }

    public int[] convert() {
        int[] convertedElements = new int[inputElements.length];
        for (int i=0;i<convertedElements.length;i++) {
            if (!inputElements[i].matches(".*\\d+.*")) { break; }
            convertedElements[i] = Integer.parseInt(inputElements[i]);
        }
        return convertedElements;
    }
}


