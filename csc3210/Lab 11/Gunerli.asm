; AddTwo.asm - adds two 32-bit integers. 
.386
.model flat,stdcall 
.stack 4096
ExitProcess PROTO,dwExitCode:DWORD 
.data 

array_list WORD 10,11,13,18,21,23,24,17,45 
array_size = ($-array_list) / (TYPE array_list)

ind WORD 0
sum WORD 0

.code
lab PROC 
mov eax, 00000000 
mov ebx, 00000000
mov ecx, 00000000
mov edx, 00000000 
mov esi, 0			 


mov ax, sum 
mov bx, ind
mov edx, OFFSET sum	 ; move the sum's address value to edx 
mov ecx, array_size  ; move array_size array ecx register  
L1:
	cmp esi,ecx  ; compare esi with ecx
	jl L2 ; if condition is met from l2 jump to L4 
	jmp L4
L2:
	add ax, array_list[esi*4] 
L3: 
	inc esi ; increment 
	jmp L1 ; jump back to comparison and condition tests 
L4:
	mov sum,ax 

INVOKE ExitProcess,0
lab ENDP
END lab