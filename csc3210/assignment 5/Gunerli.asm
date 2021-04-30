; Hakan Gunerli
; csc3210
; assignment5 
; using recursion to find the sum of 1 to n 
.386
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode: dword
.data 
n WORD 4 ; n is your variable here. 
Sum DWORD 0 ; will be used for holding values in it
.code
Recur PROC
	cmp edx, ecx ; 
	jb exit ; if edx < ecx exit aka the else. 
	add eax, ecx ; eax += ecx 
	inc ecx ; ecx++ 
	call Recur ; calls itself, aka recursive 
	exit:
		mov Sum, eax 
		ret
Recur ENDP
main PROC
	mov eax, 0
	mov ecx, 1 ; for increment
	movzx edx, n
	call Recur
INVOKE ExitProcess, 0 ; at the end, for n=4 the result should be 10 at eax 
main ENDP

End main