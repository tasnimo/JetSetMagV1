/***********************************************************************
 * Module:  InterfaceGestionSortie.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionSortie
 ***********************************************************************/

import java.util.*;

/** @pdOid dcc2710b-c8b5-456c-beee-cc810349d47b */
public class InterfaceGestionSortie {
   /** @pdRoleInfo migr=no name=InterfaceGestionEvent assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceGestionEvent> interfaceGestionEvent;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceGestionEvent> getInterfaceGestionEvent() {
      if (interfaceGestionEvent == null)
         interfaceGestionEvent = new java.util.HashSet<InterfaceGestionEvent>();
      return interfaceGestionEvent;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceGestionEvent() {
      if (interfaceGestionEvent == null)
         interfaceGestionEvent = new java.util.HashSet<InterfaceGestionEvent>();
      return interfaceGestionEvent.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceGestionEvent */
   public void setInterfaceGestionEvent(java.util.Collection<InterfaceGestionEvent> newInterfaceGestionEvent) {
      removeAllInterfaceGestionEvent();
      for (java.util.Iterator iter = newInterfaceGestionEvent.iterator(); iter.hasNext();)
         addInterfaceGestionEvent((InterfaceGestionEvent)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceGestionEvent */
   public void addInterfaceGestionEvent(InterfaceGestionEvent newInterfaceGestionEvent) {
      if (newInterfaceGestionEvent == null)
         return;
      if (this.interfaceGestionEvent == null)
         this.interfaceGestionEvent = new java.util.HashSet<InterfaceGestionEvent>();
      if (!this.interfaceGestionEvent.contains(newInterfaceGestionEvent))
         this.interfaceGestionEvent.add(newInterfaceGestionEvent);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceGestionEvent */
   public void removeInterfaceGestionEvent(InterfaceGestionEvent oldInterfaceGestionEvent) {
      if (oldInterfaceGestionEvent == null)
         return;
      if (this.interfaceGestionEvent != null)
         if (this.interfaceGestionEvent.contains(oldInterfaceGestionEvent))
            this.interfaceGestionEvent.remove(oldInterfaceGestionEvent);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceGestionEvent() {
      if (interfaceGestionEvent != null)
         interfaceGestionEvent.clear();
   }

}