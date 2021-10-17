Visual selection is a common feature in applications, but Vim's visual selection has several benefits.

To cut-and-paste or copy-and-paste:

1.Position the cursor at the beginning of the text you want to cut/copy.
2.Press v to begin character-based visual selection, or V to select whole lines, or Ctrl-v or Ctrl-q to select a block.
3.Move the cursor to the end of the text to be cut/copied. While selecting text, you can perform searches and other advanced movement.
4.Press d (delete) to cut, or y (yank) to copy.
5.Move the cursor to the desired paste location.
6.Press p to paste after the cursor, or P to paste before.

Visual selection (steps 1-3) can be performed using a mouse.

If you want to change the selected text, press c instead of d or y in step 4. In a visual selection, pressing c performs a change by deleting the selected text and entering insert mode so you can type the new text.


