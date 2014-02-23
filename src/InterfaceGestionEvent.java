/***********************************************************************
 * Module:  InterfaceGestionEvent.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionEvent
 ***********************************************************************/

import java.util.*;

/** @pdOid 89c0d5b1-bfea-44c9-bda1-98153220c6b4 */
public class InterfaceGestionEvent {
   /** @pdRoleInfo migr=no name=InterfaceAjoutEvent assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<InterfaceAjoutEvent> interfaceAjoutEvent;
   /** @pdRoleInfo migr=no name=InterfaceAccueilAdmin assc=association17 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAccueilAdmin> interfaceAccueilAdmin;
   /** @pdRoleInfo migr=no name=GererEvent assc=association48 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<GererEvent> gererEvent;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceAjoutEvent> getInterfaceAjoutEvent() {
      if (interfaceAjoutEvent == null)
         interfaceAjoutEvent = new java.util.HashSet<InterfaceAjoutEvent>();
      return interfaceAjoutEvent;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceAjoutEvent() {
      if (interfaceAjoutEvent == null)
         interfaceAjoutEvent = new java.util.HashSet<InterfaceAjoutEvent>();
      return interfaceAjoutEvent.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceAjoutEvent */
   public void setInterfaceAjoutEvent(java.util.Collection<InterfaceAjoutEvent> newInterfaceAjoutEvent) {
      removeAllInterfaceAjoutEvent();
      for (java.util.Iterator iter = newInterfaceAjoutEvent.iterator(); iter.hasNext();)
         addInterfaceAjoutEvent((InterfaceAjoutEvent)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceAjoutEvent */
   public void addInterfaceAjoutEvent(InterfaceAjoutEvent newInterfaceAjoutEvent) {
      if (newInterfaceAjoutEvent == null)
         return;
      if (this.interfaceAjoutEvent == null)
         this.interfaceAjoutEvent = new java.util.HashSet<InterfaceAjoutEvent>();
      if (!this.interfaceAjoutEvent.contains(newInterfaceAjoutEvent))
         this.interfaceAjoutEvent.add(newInterfaceAjoutEvent);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceAjoutEvent */
   public void removeInterfaceAjoutEvent(InterfaceAjoutEvent oldInterfaceAjoutEvent) {
      if (oldInterfaceAjoutEvent == null)
         return;
      if (this.interfaceAjoutEvent != null)
         if (this.interfaceAjoutEvent.contains(oldInterfaceAjoutEvent))
            this.interfaceAjoutEvent.remove(oldInterfaceAjoutEvent);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceAjoutEvent() {
      if (interfaceAjoutEvent != null)
         interfaceAjoutEvent.clear();
   }
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