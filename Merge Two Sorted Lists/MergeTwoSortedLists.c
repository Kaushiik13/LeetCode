struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode *head = NULL;
    struct ListNode *pt = NULL;

    // Helper function to copy nodes from a list to the new list
    void copyNodes(struct ListNode **dest, struct ListNode *src) {
        while (src != NULL) {
            struct ListNode *temp = malloc(sizeof(struct ListNode));
            temp->val = src->val;
            temp->next = NULL;
            if (*dest == NULL) {
                // For the first node
                *dest = temp;
            } else {
                pt->next = temp;
            }
            pt = temp;
            src = src->next;
        }
    }

    // Initialize pt for copyNodes function
    pt = NULL;
    copyNodes(&head, list1);
    copyNodes(&head, list2);

    // Bubble sort using nested while loops
    struct ListNode *current = head, *index = NULL;
    int temp;

    if (head == NULL) {
        return NULL;
    } else {
        while (current != NULL) {
            // Node index will point to node next to current
            index = current->next;

            while (index != NULL) {
                // If current node's data is greater than index's node data, swap the data  between them
                if (current->val > index->val) {
                    temp = current->val;
                    current->val = index->val;
                    index->val = temp;
                }
                index = index->next;
            }
            current = current->next;
        }
    }

    return head;
}
