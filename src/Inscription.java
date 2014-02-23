/***********************************************************************
 * Module:  Inscription.java
 * Author:  tasnim
 * Purpose: Defines the Class Inscription
 ***********************************************************************/

import java.util.*;

/** @pdOid aeb57f73-23cc-4bcf-ac48-623832b60174 */
public class Inscription {
   /** @pdRoleInfo migr=no name=InterfaceInscription assc=association53 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceInscription> interfaceInscription;
   
   /** @pdOid fd347b18-7bfc-4edf-a1c1-7a1f398b14cd */
   public int createMembre() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 40ce53ce-52a1-4022-a630-76726137784e */
   public int redirectionPage() {
      // TODO: implement
      return 0;
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