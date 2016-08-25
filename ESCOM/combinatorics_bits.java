import java.util.ArrayList;
public class RegularInvestigator {

  public ArrayList createCombinations(ArrayList listOfFlightNumbers) {

  ArrayList<String> result = new ArrayList<String>();

  for(int i = 1; i < listOfFlightNumbers.size(); i++) {

    String binaryEqvivalent = Integer.toBinaryString(i);
    System.out.println(binaryEqvivalent);
    String element = "";

    for(int j = 0; j < binaryEqvivalent.length(); j++)
      if(binaryEqvivalent.charAt(j) == '1')
        element += listOfFlightNumbers + " ";

    result.add(element.substring(0, element.length() - 1));
  }

  return result;
  }

  private String getContent(ArrayList<String> flight) {
  String temp = "";

  for(int i = 0; i < flight.size() - 1; i++)  temp += flight.get(i) + " ";

  temp += flight.get(flight.size() - 1);

  return temp;
  }

  private ArrayList removeElementAtIndex(ArrayList flight, int position) {

  ArrayList<String> res = new ArrayList<String>();

  for(int i = 0; i < flight.size(); i++) {
    if(i != position) res.add(flight.get(i));
  }

  return res;
  } 
}
