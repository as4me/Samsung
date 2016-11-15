
Public Class Form1
    Dim n, i As Integer
    Dim h(15) As Integer

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        n = TextBox1.Text


        Dim fam(n) As String
        Dim b(n), d(n), r(n), t(n), m(n), v(n)

        FileOpen(1, "f.txt", OpenMode.Input)
        For i = 1 To n
            Input(1, fam(i))
            ListBox1.Items.Add(fam(i))
            Randomize()
            m(i) = Int(Rnd() * 4) + 2
            d(i) = Int(Rnd() * 4) + 2
            r(i) = Int(Rnd() * 4) + 2
            t(i) = Int(Rnd() * 4) + 2
            ListBox2.Items.Add(m(i))
            ListBox3.Items.Add(d(i))
            ListBox4.Items.Add(r(i))
            ListBox5.Items.Add(t(i))

            b(i) = InputBox("Введите бонус ")
            ListBox6.Items.Add(b(i))
            h(i) = m(i) + d(i) + r(i) + t(i) + b(i)
            ListBox7.Items.Add(h(i))
        Next
        Dim max, min, l, p As Integer
        max = 1
        min = 23
        For i = 1 To n
            If h(i) >= max Then
                max = h(i)

            End If
            If h(i) < min Then
                min = h(i)
            End If

        Next
        For i = 1 To n
            If h(i) - min Then
                ListBox9.Items.Add(fam(i) & "_" & min)
            End If
            If h(i) = max Then
                ListBox10.Items.Add(fam(i) & "_" & max)

            End If
        Next
        
        



       

    End Sub

    
    
End Class








