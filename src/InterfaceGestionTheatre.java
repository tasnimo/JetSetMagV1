/***********************************************************************
 * Module:  InterfaceGestionTheatre.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionTheatre
 ***********************************************************************/

import java.util.*;

/** @pdOid 04123354-432b-4f93-a9a1-38b070025c68 */
public class InterfaceGestionTheatre {
   /** @pdRoleInfo migr=no name=InterfaceGestionEvent assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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