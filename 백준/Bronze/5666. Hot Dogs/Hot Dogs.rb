while (k=gets)
    if(k.nil?)
        break
    end
    a,b=k.split.map(&:to_f)
    puts ('%.2f' %(a/b))
end