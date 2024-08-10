struct ListNode *swapPairs(struct ListNode *head) {
    int ct = 0;
    struct ListNode *current = head;
    int temp;

    while (current != NULL&&current->next != NULL)
    {
        ct++;
        if (ct % 2 != 0)
        {
            int temp = current->val;
            current->val = current->next->val;
            current->next->val = temp;
        }

        current = current->next;
    }

    return head;
}
