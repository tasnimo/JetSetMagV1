/***********************************************************************
 * Module:  InterfaceAccueilClient.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceAccueilClient
 ***********************************************************************/

import java.util.*;

/** @pdOid f7ae16cc-046e-4730-8eb2-8858e825451e */
public class InterfaceAccueilClient {
   /** @pdRoleInfo migr=no name=InterfaceConsultationArticle assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationArticle> interfaceConsultationArticle;
   /** @pdRoleInfo migr=no name=InterfaceAuthentification assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAuthentification> interfaceAuthentification;
   /** @pdRoleInfo migr=no name=InterfaceConsultationFilm assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationFilm> interfaceConsultationFilm;
   /** @pdRoleInfo migr=no name=InterfaceConsultationStatistiques assc=association16 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationStatistiques> interfaceConsultationStatistiques;
   /** @pdRoleInfo migr=no name=InterfaceConsultationEvent assc=association38 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationEvent> interfaceConsultationEvent;
   /** @pdRoleInfo migr=no name=InterfaceConsultationBonPlan assc=association39 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceConsultationBonPlan> interfaceConsultationBonPlan;
   /** @pdRoleInfo migr=no name=InterfaceInscription assc=association51 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceInscription> interfaceInscription;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationArticle> getInterfaceConsultationArticle() {
      if (interfaceConsultationArticle == null)
         interfaceConsultationArticle = new java.util.HashSet<InterfaceConsultationArticle>();
      return interfaceConsultationArticle;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationArticle() {
      if (interfaceConsultationArticle == null)
         interfaceConsultationArticle = new java.util.HashSet<InterfaceConsultationArticle>();
      return interfaceConsultationArticle.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationArticle */
   public void setInterfaceConsultationArticle(java.util.Collection<InterfaceConsultationArticle> newInterfaceConsultationArticle) {
      removeAllInterfaceConsultationArticle();
      for (java.util.Iterator iter = newInterfaceConsultationArticle.iterator(); iter.hasNext();)
         addInterfaceConsultationArticle((InterfaceConsultationArticle)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationArticle */
   public void addInterfaceConsultationArticle(InterfaceConsultationArticle newInterfaceConsultationArticle) {
      if (newInterfaceConsultationArticle == null)
         return;
      if (this.interfaceConsultationArticle == null)
         this.interfaceConsultationArticle = new java.util.HashSet<InterfaceConsultationArticle>();
      if (!this.interfaceConsultationArticle.contains(newInterfaceConsultationArticle))
         this.interfaceConsultationArticle.add(newInterfaceConsultationArticle);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationArticle */
   public void removeInterfaceConsultationArticle(InterfaceConsultationArticle oldInterfaceConsultationArticle) {
      if (oldInterfaceConsultationArticle == null)
         return;
      if (this.interfaceConsultationArticle != null)
         if (this.interfaceConsultationArticle.contains(oldInterfaceConsultationArticle))
            this.interfaceConsultationArticle.remove(oldInterfaceConsultationArticle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationArticle() {
      if (interfaceConsultationArticle != null)
         interfaceConsultationArticle.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceAuthentification> getInterfaceAuthentification() {
      if (interfaceAuthentification == null)
         interfaceAuthentification = new java.util.HashSet<InterfaceAuthentification>();
      return interfaceAuthentification;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceAuthentification() {
      if (interfaceAuthentification == null)
         interfaceAuthentification = new java.util.HashSet<InterfaceAuthentification>();
      return interfaceAuthentification.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceAuthentification */
   public void setInterfaceAuthentification(java.util.Collection<InterfaceAuthentification> newInterfaceAuthentification) {
      removeAllInterfaceAuthentification();
      for (java.util.Iterator iter = newInterfaceAuthentification.iterator(); iter.hasNext();)
         addInterfaceAuthentification((InterfaceAuthentification)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceAuthentification */
   public void addInterfaceAuthentification(InterfaceAuthentification newInterfaceAuthentification) {
      if (newInterfaceAuthentification == null)
         return;
      if (this.interfaceAuthentification == null)
         this.interfaceAuthentification = new java.util.HashSet<InterfaceAuthentification>();
      if (!this.interfaceAuthentification.contains(newInterfaceAuthentification))
         this.interfaceAuthentification.add(newInterfaceAuthentification);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceAuthentification */
   public void removeInterfaceAuthentification(InterfaceAuthentification oldInterfaceAuthentification) {
      if (oldInterfaceAuthentification == null)
         return;
      if (this.interfaceAuthentification != null)
         if (this.interfaceAuthentification.contains(oldInterfaceAuthentification))
            this.interfaceAuthentification.remove(oldInterfaceAuthentification);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceAuthentification() {
      if (interfaceAuthentification != null)
         interfaceAuthentification.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationFilm> getInterfaceConsultationFilm() {
      if (interfaceConsultationFilm == null)
         interfaceConsultationFilm = new java.util.HashSet<InterfaceConsultationFilm>();
      return interfaceConsultationFilm;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationFilm() {
      if (interfaceConsultationFilm == null)
         interfaceConsultationFilm = new java.util.HashSet<InterfaceConsultationFilm>();
      return interfaceConsultationFilm.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationFilm */
   public void setInterfaceConsultationFilm(java.util.Collection<InterfaceConsultationFilm> newInterfaceConsultationFilm) {
      removeAllInterfaceConsultationFilm();
      for (java.util.Iterator iter = newInterfaceConsultationFilm.iterator(); iter.hasNext();)
         addInterfaceConsultationFilm((InterfaceConsultationFilm)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationFilm */
   public void addInterfaceConsultationFilm(InterfaceConsultationFilm newInterfaceConsultationFilm) {
      if (newInterfaceConsultationFilm == null)
         return;
      if (this.interfaceConsultationFilm == null)
         this.interfaceConsultationFilm = new java.util.HashSet<InterfaceConsultationFilm>();
      if (!this.interfaceConsultationFilm.contains(newInterfaceConsultationFilm))
         this.interfaceConsultationFilm.add(newInterfaceConsultationFilm);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationFilm */
   public void removeInterfaceConsultationFilm(InterfaceConsultationFilm oldInterfaceConsultationFilm) {
      if (oldInterfaceConsultationFilm == null)
         return;
      if (this.interfaceConsultationFilm != null)
         if (this.interfaceConsultationFilm.contains(oldInterfaceConsultationFilm))
            this.interfaceConsultationFilm.remove(oldInterfaceConsultationFilm);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationFilm() {
      if (interfaceConsultationFilm != null)
         interfaceConsultationFilm.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationStatistiques> getInterfaceConsultationStatistiques() {
      if (interfaceConsultationStatistiques == null)
         interfaceConsultationStatistiques = new java.util.HashSet<InterfaceConsultationStatistiques>();
      return interfaceConsultationStatistiques;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationStatistiques() {
      if (interfaceConsultationStatistiques == null)
         interfaceConsultationStatistiques = new java.util.HashSet<InterfaceConsultationStatistiques>();
      return interfaceConsultationStatistiques.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationStatistiques */
   public void setInterfaceConsultationStatistiques(java.util.Collection<InterfaceConsultationStatistiques> newInterfaceConsultationStatistiques) {
      removeAllInterfaceConsultationStatistiques();
      for (java.util.Iterator iter = newInterfaceConsultationStatistiques.iterator(); iter.hasNext();)
         addInterfaceConsultationStatistiques((InterfaceConsultationStatistiques)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationStatistiques */
   public void addInterfaceConsultationStatistiques(InterfaceConsultationStatistiques newInterfaceConsultationStatistiques) {
      if (newInterfaceConsultationStatistiques == null)
         return;
      if (this.interfaceConsultationStatistiques == null)
         this.interfaceConsultationStatistiques = new java.util.HashSet<InterfaceConsultationStatistiques>();
      if (!this.interfaceConsultationStatistiques.contains(newInterfaceConsultationStatistiques))
         this.interfaceConsultationStatistiques.add(newInterfaceConsultationStatistiques);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationStatistiques */
   public void removeInterfaceConsultationStatistiques(InterfaceConsultationStatistiques oldInterfaceConsultationStatistiques) {
      if (oldInterfaceConsultationStatistiques == null)
         return;
      if (this.interfaceConsultationStatistiques != null)
         if (this.interfaceConsultationStatistiques.contains(oldInterfaceConsultationStatistiques))
            this.interfaceConsultationStatistiques.remove(oldInterfaceConsultationStatistiques);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationStatistiques() {
      if (interfaceConsultationStatistiques != null)
         interfaceConsultationStatistiques.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationEvent> getInterfaceConsultationEvent() {
      if (interfaceConsultationEvent == null)
         interfaceConsultationEvent = new java.util.HashSet<InterfaceConsultationEvent>();
      return interfaceConsultationEvent;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationEvent() {
      if (interfaceConsultationEvent == null)
         interfaceConsultationEvent = new java.util.HashSet<InterfaceConsultationEvent>();
      return interfaceConsultationEvent.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationEvent */
   public void setInterfaceConsultationEvent(java.util.Collection<InterfaceConsultationEvent> newInterfaceConsultationEvent) {
      removeAllInterfaceConsultationEvent();
      for (java.util.Iterator iter = newInterfaceConsultationEvent.iterator(); iter.hasNext();)
         addInterfaceConsultationEvent((InterfaceConsultationEvent)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationEvent */
   public void addInterfaceConsultationEvent(InterfaceConsultationEvent newInterfaceConsultationEvent) {
      if (newInterfaceConsultationEvent == null)
         return;
      if (this.interfaceConsultationEvent == null)
         this.interfaceConsultationEvent = new java.util.HashSet<InterfaceConsultationEvent>();
      if (!this.interfaceConsultationEvent.contains(newInterfaceConsultationEvent))
         this.interfaceConsultationEvent.add(newInterfaceConsultationEvent);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationEvent */
   public void removeInterfaceConsultationEvent(InterfaceConsultationEvent oldInterfaceConsultationEvent) {
      if (oldInterfaceConsultationEvent == null)
         return;
      if (this.interfaceConsultationEvent != null)
         if (this.interfaceConsultationEvent.contains(oldInterfaceConsultationEvent))
            this.interfaceConsultationEvent.remove(oldInterfaceConsultationEvent);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationEvent() {
      if (interfaceConsultationEvent != null)
         interfaceConsultationEvent.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceConsultationBonPlan> getInterfaceConsultationBonPlan() {
      if (interfaceConsultationBonPlan == null)
         interfaceConsultationBonPlan = new java.util.HashSet<InterfaceConsultationBonPlan>();
      return interfaceConsultationBonPlan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceConsultationBonPlan() {
      if (interfaceConsultationBonPlan == null)
         interfaceConsultationBonPlan = new java.util.HashSet<InterfaceConsultationBonPlan>();
      return interfaceConsultationBonPlan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceConsultationBonPlan */
   public void setInterfaceConsultationBonPlan(java.util.Collection<InterfaceConsultationBonPlan> newInterfaceConsultationBonPlan) {
      removeAllInterfaceConsultationBonPlan();
      for (java.util.Iterator iter = newInterfaceConsultationBonPlan.iterator(); iter.hasNext();)
         addInterfaceConsultationBonPlan((InterfaceConsultationBonPlan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceConsultationBonPlan */
   public void addInterfaceConsultationBonPlan(InterfaceConsultationBonPlan newInterfaceConsultationBonPlan) {
      if (newInterfaceConsultationBonPlan == null)
         return;
      if (this.interfaceConsultationBonPlan == null)
         this.interfaceConsultationBonPlan = new java.util.HashSet<InterfaceConsultationBonPlan>();
      if (!this.interfaceConsultationBonPlan.contains(newInterfaceConsultationBonPlan))
         this.interfaceConsultationBonPlan.add(newInterfaceConsultationBonPlan);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceConsultationBonPlan */
   public void removeInterfaceConsultationBonPlan(InterfaceConsultationBonPlan oldInterfaceConsultationBonPlan) {
      if (oldInterfaceConsultationBonPlan == null)
         return;
      if (this.interfaceConsultationBonPlan != null)
         if (this.interfaceConsultationBonPlan.contains(oldInterfaceConsultationBonPlan))
            this.interfaceConsultationBonPlan.remove(oldInterfaceConsultationBonPlan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceConsultationBonPlan() {
      if (interfaceConsultationBonPlan != null)
         interfaceConsultationBonPlan.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceInscription> getInterfaceInscription() {
      if (interfaceInscription == null)
         interfaceInscription = new java.util.HashSet<InterfaceInscription>();
      return interfaceInscription;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceInscription() {
      if (interfaceInscription == null)
         interfaceInscription = new java.util.HashSet<InterfaceInscription>();
      return interfaceInscription.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceInscription */
   public void setInterfaceInscription(java.util.Collection<InterfaceInscription> newInterfaceInscription) {
      removeAllInterfaceInscription();
      for (java.util.Iterator iter = newInterfaceInscription.iterator(); iter.hasNext();)
         addInterfaceInscription((InterfaceInscription)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceInscription */
   public void addInterfaceInscription(InterfaceInscription newInterfaceInscription) {
      if (newInterfaceInscription == null)
         return;
      if (this.interfaceInscription == null)
         this.interfaceInscription = new java.util.HashSet<InterfaceInscription>();
      if (!this.interfaceInscription.contains(newInterfaceInscription))
         this.interfaceInscription.add(newInterfaceInscription);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceInscription */
   public void removeInterfaceInscription(InterfaceInscription oldInterfaceInscription) {
      if (oldInterfaceInscription == null)
         return;
      if (this.interfaceInscription != null)
         if (this.interfaceInscription.contains(oldInterfaceInscription))
            this.interfaceInscription.remove(oldInterfaceInscription);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceInscription() {
      if (interfaceInscription != null)
         interfaceInscription.clear();
   }

}