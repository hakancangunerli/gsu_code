; Hakan Gunerli, Lab13 

.386
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode: dword
.data
	array DWORD 10h, 20h, 30h, 40h, 50h
	sample DWORD 50h
.code
main PROC
	mov ebx, sample
	mov ecx, LENGTHOF array
	mov edx, TYPE array
	mov esi, OFFSET array
	call Search
	INVOKE ExitProcess, 0
main ENDP

Search PROC
push esi
push ecx
L1:
	cmp ebx, [esi]
	JNE L2
	mov ebx, [esi]
	JMP ifFound
L2:
	add esi, edx
LOOP L1
NotFound:
	mov eax, -1 ; if it is not ifFound, return -1 
	JMP EndProc ; the end pop at the end 
ifFound:
	mov eax, ebx ; ifFound return eax 
EndProc:
pop ecx ; pop at the end of procedure
pop esi ; pop at the end of procedure 
ret

Search ENDP
END main