/***********************************************************************
 * Module:  InterfaceGestionSoiree.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionSoiree
 ***********************************************************************/

import java.util.*;

/** @pdOid 93b111e0-cc3d-4eb6-9e46-8c5f8c47d0b0 */
public class InterfaceGestionSoiree {
   /** @pdRoleInfo migr=no name=InterfaceGestionEvent assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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