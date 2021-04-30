; hakan gunerli
; csc3210
; assignment 4 q1 
; this program attempts to short-circuit evaluate the given arguments, with the result sum =7 
.386
.model flat, stdcall
.stack 4096
ExitProcess proto, dwExitCode:dword
.data
A SWORD 9
B SWORD 8
X SWORD 15
SUM WORD 0
.code
main PROC
mov cx, SUM

add A, 3
mov ax, A
sub A,3 

sub B, 3
mov bx, B
add B,3

beginwhile:
	cmp X, 0
	jl endwhile
	cmp X, 3
	je L2
	cmp X, ax
	jg L2
	sub X, 2
	inc SUM
	jmp beginwhile
L2:
	sub X, 1
	jmp beginwhile
endwhile:
	mov cx, SUM
invoke ExitProcess,0
main endp
end main