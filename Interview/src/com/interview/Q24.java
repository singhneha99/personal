package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
class Country {
    private String name;
 
    public Country(String name) {
      this.name = name;
    }
 
    public String getName() {
      return name;
    }
 
    public void setName(String name) {
      this.name = name;
    }
 
    @Override
    public String toString() {
      return name;
    }
  }
//Available: United States, Mexico, Canada, Costa Rica, Bermuda, Belgium
//Special: Canada, Mexico, France, Belgium
//Result: Canada, Mexico, Belgium, Bermuda, Costa Rica, United States
public class Q24 {
 
	public static void main(String[] args) {
		  List<Country> availableCountries;
		  List<Country> specialCountries;
		  
		   Country specialA = new Country("Canada");
		   Country specialB = new Country("Mexico");
		   Country specialC = new Country("France");
		   Country specialD = new Country("Belgium");
		  
 
		   Country countryA = new Country("United States");
		   Country countryB = new Country("Mexico");
		   Country countryC = new Country("Canada");
		   Country countryD = new Country("Costa Rica");
		   Country countryE = new Country("Bermuda");
		   Country countryF = new Country("Belgium");
		  
		  availableCountries = new ArrayList<Country>();
 
		    availableCountries.add(countryF);
		    availableCountries.add(countryE);
		    availableCountries.add(countryA);
		    availableCountries.add(countryC);
		    availableCountries.add(countryB);
		    availableCountries.add(countryD);
 
		  specialCountries = new ArrayList<Country>();
		    specialCountries.add(specialA);
		    specialCountries.add(specialB);
		    specialCountries.add(specialC);
		    specialCountries.add(specialD);
		    
		  List<Country> resCtryList = sortCountries(availableCountries, specialCountries);
		  System.out.println(resCtryList);
 
	}
 
	private static List<Country> sortCountries(List<Country> availableCountries, List<Country> specialCountries) {
		
		List<Country> remainingCountries = new ArrayList<Country>();
		
		for(Country c: specialCountries)
		{
			if(availableCountries.contains(c))
			{
				continue;
			}
			else
			{
				remainingCountries.add(c);
			}
		}
		
		remainingCountries = remainingCountries.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		
		
		return remainingCountries;
	}
 
}
