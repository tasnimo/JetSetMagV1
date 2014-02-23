/***********************************************************************
 * Module:  InterfaceInscription.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceInscription
 ***********************************************************************/

import java.util.*;

/** @pdOid 2b4d7357-791e-468f-9b11-f61618c94da7 */
public class InterfaceInscription {
   /** @pdRoleInfo migr=no name=InterfaceAccueilMembre assc=association52 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAccueilMembre> interfaceAccueilMembre;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceAccueilMembre> getInterfaceAccueilMembre() {
      if (interfaceAccueilMembre == null)
         interfaceAccueilMembre = new java.util.HashSet<InterfaceAccueilMembre>();
      return interfaceAccueilMembre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceAccueilMembre() {
      if (interfaceAccueilMembre == null)
         interfaceAccueilMembre = new java.util.HashSet<InterfaceAccueilMembre>();
      return interfaceAccueilMembre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceAccueilMembre */
   public void setInterfaceAccueilMembre(java.util.Collection<InterfaceAccueilMembre> newInterfaceAccueilMembre) {
      removeAllInterfaceAccueilMembre();
      for (java.util.Iterator iter = newInterfaceAccueilMembre.iterator(); iter.hasNext();)
         addInterfaceAccueilMembre((InterfaceAccueilMembre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceAccueilMembre */
   public void addInterfaceAccueilMembre(InterfaceAccueilMembre newInterfaceAccueilMembre) {
      if (newInterfaceAccueilMembre == null)
         return;
      if (this.interfaceAccueilMembre == null)
         this.interfaceAccueilMembre = new java.util.HashSet<InterfaceAccueilMembre>();
      if (!this.interfaceAccueilMembre.contains(newInterfaceAccueilMembre))
         this.interfaceAccueilMembre.add(newInterfaceAccueilMembre);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceAccueilMembre */
   public void removeInterfaceAccueilMembre(InterfaceAccueilMembre oldInterfaceAccueilMembre) {
      if (oldInterfaceAccueilMembre == null)
         return;
      if (this.interfaceAccueilMembre != null)
         if (this.interfaceAccueilMembre.contains(oldInterfaceAccueilMembre))
            this.interfaceAccueilMembre.remove(oldInterfaceAccueilMembre);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceAccueilMembre() {
      if (interfaceAccueilMembre != null)
         interfaceAccueilMembre.clear();
   }

}