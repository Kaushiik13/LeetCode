struct ListNode* rotateRight(struct ListNode* head, int k) {
    int ct=0;
    struct ListNode *p=head;
    while(p!=NULL)
    {
        ct++;
        p=p->next;
    }
     if (head == NULL || head->next == NULL) {
            return head;
         }
    
    k = k % ct;
    if (k == 0) {
        return head;
    }
        for(int i=0;i<k;i++)
        {
            struct ListNode *pt=head;
         while(pt!=NULL)
        {
            struct ListNode *LastNode=pt->next;
            if(LastNode->next==NULL)
            {
            struct ListNode *temp=malloc(sizeof(struct ListNode));
            temp->val=LastNode->val;
            pt->next=NULL;
            temp->next=head;
            head=temp;
            free(LastNode);
            }
            pt=pt->next;
        }
        }
   
 return head;   
}
