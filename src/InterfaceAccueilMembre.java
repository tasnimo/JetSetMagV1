/***********************************************************************
 * Module:  InterfaceAccueilMembre.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceAccueilMembre
 ***********************************************************************/

import java.util.*;

/** @pdOid fe6cbe50-1133-4f76-a28f-2ec41ba7cadb */
public class InterfaceAccueilMembre extends InterfaceAccueilClient {
   /** @pdRoleInfo migr=no name=InterfaceAjoutEvent assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAjoutEvent> interfaceAjoutEvent;
   
   
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

}