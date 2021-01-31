package com.ecommerce.entities;



import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Panier implements Serializable {
   private Map<Long, LignePanier> items=new HashMap<Long, LignePanier>();
   
   public void addArticle(Produit p,int quantite){
	   if(items.get(p.getIdProduit())==null){
		   LignePanier lc=new LignePanier();
		   lc.setProduit(p);
		   lc.setQuantite(quantite);
		   lc.setPrix(p.getPrix());
	   }
	   else{
		   LignePanier lc=items.get(p.getIdProduit());
		   lc.setQuantite(lc.getQuantite()+quantite);
	   }
   }
   public Collection<LignePanier> getItems(){
	   return items.values();
   }
   public double getTotal(){
	   double total=0;
	   for(LignePanier lc:items.values()){
		   total+=lc.getPrix()*lc.getQuantite();
	   }
	   return total;
   }
   public int getSize(){
	   return items.size();
   }
   public void deleteItem(Long idProduit){
	   items.remove(idProduit);
   }
}

