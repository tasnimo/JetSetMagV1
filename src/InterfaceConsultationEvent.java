/***********************************************************************
 * Module:  InterfaceConsultationEvent.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceConsultationEvent
 ***********************************************************************/

import java.util.*;

/** @pdOid 4a046654-2c05-4576-8747-9426135c2bbf */
public class InterfaceConsultationEvent {
   /** @pdRoleInfo migr=no name=InterfaceConsultationSoiree assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationSoiree> interfaceConsultationSoiree;
   /** @pdRoleInfo migr=no name=InterfaceConsultationSortie assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationSortie> interfaceConsultationSortie;
   /** @pdRoleInfo migr=no name=InterfaceConsultationTheatre assc=association15 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationTheatre> interfaceConsultationTheatre;
   /** @pdRoleInfo migr=no name=GererEvent assc=association49 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<GererEvent> gererEvent;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationSoiree> getInterfaceConsultationSoiree() {
      if (interfaceConsultationSoiree == null)
         interfaceConsultationSoiree = new java.util.HashSet<InterfaceConsultationSoiree>();
      return interfaceConsultationSoiree;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationSoiree() {
      if (interfaceConsultationSoiree == null)
         interfaceConsultationSoiree = new java.util.HashSet<InterfaceConsultationSoiree>();
      return interfaceConsultationSoiree.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationSoiree */
   public void setInterfaceConsultationSoiree(java.util.Collection<InterfaceConsultationSoiree> newInterfaceConsultationSoiree) {
      removeAllInterfaceConsultationSoiree();
      for (java.util.Iterator iter = newInterfaceConsultationSoiree.iterator(); iter.hasNext();)
         addInterfaceConsultationSoiree((InterfaceConsultationSoiree)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationSoiree */
   public void addInterfaceConsultationSoiree(InterfaceConsultationSoiree newInterfaceConsultationSoiree) {
      if (newInterfaceConsultationSoiree == null)
         return;
      if (this.interfaceConsultationSoiree == null)
         this.interfaceConsultationSoiree = new java.util.HashSet<InterfaceConsultationSoiree>();
      if (!this.interfaceConsultationSoiree.contains(newInterfaceConsultationSoiree))
         this.interfaceConsultationSoiree.add(newInterfaceConsultationSoiree);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationSoiree */
   public void removeInterfaceConsultationSoiree(InterfaceConsultationSoiree oldInterfaceConsultationSoiree) {
      if (oldInterfaceConsultationSoiree == null)
         return;
      if (this.interfaceConsultationSoiree != null)
         if (this.interfaceConsultationSoiree.contains(oldInterfaceConsultationSoiree))
            this.interfaceConsultationSoiree.remove(oldInterfaceConsultationSoiree);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationSoiree() {
      if (interfaceConsultationSoiree != null)
         interfaceConsultationSoiree.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationSortie> getInterfaceConsultationSortie() {
      if (interfaceConsultationSortie == null)
         interfaceConsultationSortie = new java.util.HashSet<InterfaceConsultationSortie>();
      return interfaceConsultationSortie;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationSortie() {
      if (interfaceConsultationSortie == null)
         interfaceConsultationSortie = new java.util.HashSet<InterfaceConsultationSortie>();
      return interfaceConsultationSortie.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationSortie */
   public void setInterfaceConsultationSortie(java.util.Collection<InterfaceConsultationSortie> newInterfaceConsultationSortie) {
      removeAllInterfaceConsultationSortie();
      for (java.util.Iterator iter = newInterfaceConsultationSortie.iterator(); iter.hasNext();)
         addInterfaceConsultationSortie((InterfaceConsultationSortie)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationSortie */
   public void addInterfaceConsultationSortie(InterfaceConsultationSortie newInterfaceConsultationSortie) {
      if (newInterfaceConsultationSortie == null)
         return;
      if (this.interfaceConsultationSortie == null)
         this.interfaceConsultationSortie = new java.util.HashSet<InterfaceConsultationSortie>();
      if (!this.interfaceConsultationSortie.contains(newInterfaceConsultationSortie))
         this.interfaceConsultationSortie.add(newInterfaceConsultationSortie);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationSortie */
   public void removeInterfaceConsultationSortie(InterfaceConsultationSortie oldInterfaceConsultationSortie) {
      if (oldInterfaceConsultationSortie == null)
         return;
      if (this.interfaceConsultationSortie != null)
         if (this.interfaceConsultationSortie.contains(oldInterfaceConsultationSortie))
            this.interfaceConsultationSortie.remove(oldInterfaceConsultationSortie);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationSortie() {
      if (interfaceConsultationSortie != null)
         interfaceConsultationSortie.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationTheatre> getInterfaceConsultationTheatre() {
      if (interfaceConsultationTheatre == null)
         interfaceConsultationTheatre = new java.util.HashSet<InterfaceConsultationTheatre>();
      return interfaceConsultationTheatre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationTheatre() {
      if (interfaceConsultationTheatre == null)
         interfaceConsultationTheatre = new java.util.HashSet<InterfaceConsultationTheatre>();
      return interfaceConsultationTheatre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationTheatre */
   public void setInterfaceConsultationTheatre(java.util.Collection<InterfaceConsultationTheatre> newInterfaceConsultationTheatre) {
      removeAllInterfaceConsultationTheatre();
      for (java.util.Iterator iter = newInterfaceConsultationTheatre.iterator(); iter.hasNext();)
         addInterfaceConsultationTheatre((InterfaceConsultationTheatre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationTheatre */
   public void addInterfaceConsultationTheatre(InterfaceConsultationTheatre newInterfaceConsultationTheatre) {
      if (newInterfaceConsultationTheatre == null)
         return;
      if (this.interfaceConsultationTheatre == null)
         this.interfaceConsultationTheatre = new java.util.HashSet<InterfaceConsultationTheatre>();
      if (!this.interfaceConsultationTheatre.contains(newInterfaceConsultationTheatre))
         this.interfaceConsultationTheatre.add(newInterfaceConsultationTheatre);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationTheatre */
   public void removeInterfaceConsultationTheatre(InterfaceConsultationTheatre oldInterfaceConsultationTheatre) {
      if (oldInterfaceConsultationTheatre == null)
         return;
      if (this.interfaceConsultationTheatre != null)
         if (this.interfaceConsultationTheatre.contains(oldInterfaceConsultationTheatre))
            this.interfaceConsultationTheatre.remove(oldInterfaceConsultationTheatre);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationTheatre() {
      if (interfaceConsultationTheatre != null)
         interfaceConsultationTheatre.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<GererEvent> getGererEvent() {
      if (gererEvent == null)
         gererEvent = new java.util.HashSet<GererEvent>();
      return gererEvent;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGererEvent() {
      if (gererEvent == null)
         gererEvent = new java.util.HashSet<GererEvent>();
      return gererEvent.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGererEvent */
   public void setGererEvent(java.util.Collection<GererEvent> newGererEvent) {
      removeAllGererEvent();
      for (java.util.Iterator iter = newGererEvent.iterator(); iter.hasNext();)
         addGererEvent((GererEvent)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGererEvent */
   public void addGererEvent(GererEvent newGererEvent) {
      if (newGererEvent == null)
         return;
      if (this.gererEvent == null)
         this.gererEvent = new java.util.HashSet<GererEvent>();
      if (!this.gererEvent.contains(newGererEvent))
         this.gererEvent.add(newGererEvent);
   }
   
   /** @pdGenerated default remove
     * @param oldGererEvent */
   public void removeGererEvent(GererEvent oldGererEvent) {
      if (oldGererEvent == null)
         return;
      if (this.gererEvent != null)
         if (this.gererEvent.contains(oldGererEvent))
            this.gererEvent.remove(oldGererEvent);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGererEvent() {
      if (gererEvent != null)
         gererEvent.clear();
   }

}