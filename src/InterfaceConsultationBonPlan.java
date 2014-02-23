/***********************************************************************
 * Module:  InterfaceConsultationBonPlan.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceConsultationBonPlan
 ***********************************************************************/

import java.util.*;

/** @pdOid b85c7f1a-9b2c-41c0-93ee-c8a4f550019b */
public class InterfaceConsultationBonPlan {
   /** @pdRoleInfo migr=no name=GererBonPlan assc=association56 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<GererBonPlan> gererBonPlan;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<GererBonPlan> getGererBonPlan() {
      if (gererBonPlan == null)
         gererBonPlan = new java.util.HashSet<GererBonPlan>();
      return gererBonPlan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGererBonPlan() {
      if (gererBonPlan == null)
         gererBonPlan = new java.util.HashSet<GererBonPlan>();
      return gererBonPlan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGererBonPlan */
   public void setGererBonPlan(java.util.Collection<GererBonPlan> newGererBonPlan) {
      removeAllGererBonPlan();
      for (java.util.Iterator iter = newGererBonPlan.iterator(); iter.hasNext();)
         addGererBonPlan((GererBonPlan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGererBonPlan */
   public void addGererBonPlan(GererBonPlan newGererBonPlan) {
      if (newGererBonPlan == null)
         return;
      if (this.gererBonPlan == null)
         this.gererBonPlan = new java.util.HashSet<GererBonPlan>();
      if (!this.gererBonPlan.contains(newGererBonPlan))
         this.gererBonPlan.add(newGererBonPlan);
   }
   
   /** @pdGenerated default remove
     * @param oldGererBonPlan */
   public void removeGererBonPlan(GererBonPlan oldGererBonPlan) {
      if (oldGererBonPlan == null)
         return;
      if (this.gererBonPlan != null)
         if (this.gererBonPlan.contains(oldGererBonPlan))
            this.gererBonPlan.remove(oldGererBonPlan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGererBonPlan() {
      if (gererBonPlan != null)
         gererBonPlan.clear();
   }

}