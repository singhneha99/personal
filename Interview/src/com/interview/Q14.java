package com.interview;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TechMahindra Q2
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FD, Gold, Shares, Bonds
		
		Asset a1 = new Asset(AssetType.FD,new BigDecimal(1000.00));
		Asset a2 = new Asset(AssetType.GOLD, new BigDecimal(2000.00));
		Asset a3 = new Asset(AssetType.SHARES, new BigDecimal(2500.00));
		Asset a4 = new Asset(AssetType.BONDS,new BigDecimal(1500.00));
		
		
		List<Asset> l1 = new ArrayList<>();
		
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		l1.add(a4);
		
		
		List<BigDecimal> money = new ArrayList<>();
		for(Asset a: l1)
		{
			money.add(a.getInvestedMoney());
		}
		
		BigDecimal sum = new BigDecimal(0.00);
		
		sum = money.stream().reduce(BigDecimal.ZERO, (p, q) -> p.add(q));
		System.out.println(sum);
		
		

	}

}

class Asset
{
	private AssetType assetType;
	private BigDecimal investedMoney;
	
	
	
	public Asset(AssetType assetType, BigDecimal investedMoney) {
		super();
		this.assetType = assetType;
		this.investedMoney = investedMoney;
	}
	
	public AssetType getAssetType() {
		return assetType;
	}
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
	public BigDecimal getInvestedMoney() {
		return investedMoney;
	}
	public void setInvestedMoney(BigDecimal investedMoney) {
		this.investedMoney = investedMoney;
	}
	
	
	
	
	

}

enum AssetType
{
	
	FD, GOLD, SHARES, BONDS
}