/***********************************************************************
 * Module:  InterfaceGestionBonPlan.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionBonPlan
 ***********************************************************************/

import java.util.*;

/** @pdOid bf3f7f0a-87ab-4229-bf3c-42f9232d8d07 */
public class InterfaceGestionBonPlan {
   /** @pdRoleInfo migr=no name=InterfaceAccueilAdmin assc=association37 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAccueilAdmin> interfaceAccueilAdmin;
   /** @pdRoleInfo migr=no name=GererBonPlan assc=association57 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<GererBonPlan> gererBonPlan;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceAccueilAdmin> getInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin == null)
         interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      return interfaceAccueilAdmin;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin == null)
         interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      return interfaceAccueilAdmin.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceAccueilAdmin */
   public void setInterfaceAccueilAdmin(java.util.Collection<InterfaceAccueilAdmin> newInterfaceAccueilAdmin) {
      removeAllInterfaceAccueilAdmin();
      for (java.util.Iterator iter = newInterfaceAccueilAdmin.iterator(); iter.hasNext();)
         addInterfaceAccueilAdmin((InterfaceAccueilAdmin)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceAccueilAdmin */
   public void addInterfaceAccueilAdmin(InterfaceAccueilAdmin newInterfaceAccueilAdmin) {
      if (newInterfaceAccueilAdmin == null)
         return;
      if (this.interfaceAccueilAdmin == null)
         this.interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      if (!this.interfaceAccueilAdmin.contains(newInterfaceAccueilAdmin))
         this.interfaceAccueilAdmin.add(newInterfaceAccueilAdmin);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceAccueilAdmin */
   public void removeInterfaceAccueilAdmin(InterfaceAccueilAdmin oldInterfaceAccueilAdmin) {
      if (oldInterfaceAccueilAdmin == null)
         return;
      if (this.interfaceAccueilAdmin != null)
         if (this.interfaceAccueilAdmin.contains(oldInterfaceAccueilAdmin))
            this.interfaceAccueilAdmin.remove(oldInterfaceAccueilAdmin);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin != null)
         interfaceAccueilAdmin.clear();
   }
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